package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }
}

// Данный паттерн (композитный объект) подразумевает создание древовидной системы
// в нашем случае есть файлы и папки
// а внутри папок другие папки с файлами

//          папка
//         /     \
//       папка   папка
//                /   \
//            файлы   папка

class File {
    String fileName;
}

// наша папка
class Folder {
    String name;
    Date creationDate;
    // список папок (рекурсия)
    List<Folder> folders = new ArrayList<>();
    List<File> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    // мы их можем добавлять и удалять

    void addFolder(Folder folder){
        folders.add(folder);
    }

    void removeFolder(Folder folder){
        folders.remove(folder);
    }

    List<Folder> getFolders(){
        return folders;
    }

    void addFile(File file){
        fileList.add(file);
    }

    void removeFile(File file){
        fileList.remove(file);
    }

    List<File> getFile(){
        return fileList;
    }
}