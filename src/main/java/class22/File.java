package class22;
/*
Create a class File that will have the following behaviors:
 open, edit, close. Edit and close are implemented method
  while open is an abstract. Create 3 subclasses:
  JavaFile, WordFile, PdfFile that will provide specific
  implementation of open behaviour: Example: to open .
  java file we need notepad++ or sublime text, to open .
  doc file we need Microsoft word to be installed etc.
 */

public abstract class File {
    private String name;
    private double size;
    abstract void open ();
    abstract void edit();
    abstract void close();

    }
    class JavaFile extends File{
    @Override
        void open(){
        System.out.println("to open java file we need IntelliJ");
    }
    @Override
        void edit(){
        System.out.println("to edite the java file we need setting");
    }
    @Override
        void close(){
        System.out.println("to close java file w");
    }

    }

    class WordFile extends File{
    @Override
        void open(){
        System.out.println("to open doc file we need Microsoft word");
    }

        @Override
        void edit() {
            System.out.println("editing");

        }

        @Override
        void close() {
            System.out.println("closing  ");

        }

    }

    class PdfFile extends File{


        @Override
        void open() {
            System.out.println("open my pdf File");

        }

        @Override
        void edit() {
            System.out.println("edit my pdf file");

        }

        @Override
        void close() {
            System.out.println("close my pdf file");

        }
    }

