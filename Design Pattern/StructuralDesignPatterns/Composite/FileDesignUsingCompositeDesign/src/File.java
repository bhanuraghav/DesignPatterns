public class File implements FileSystem{
    String fileName;

    public File(String fn){
        this.fileName= fn;
    }


    @Override
    public void ls(){
        System.out.println("file name " + fileName);
    }


}
