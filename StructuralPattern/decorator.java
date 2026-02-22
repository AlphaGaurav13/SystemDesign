import java.util.ArrayList;
interface DataSource
{
    void writeData(String data);
    String readData();
}
class FileDataSource implements DataSource{

    private String filename;

    public FileDataSource(String filename)
    {
        this.filename = filename;
    }

    public void writeData(String data)
    {
        // write to file
    }

    public void readData() 
    {
        // read from file
    }


}

class EncryptionDecorator implements DataSource
{
    private DataSource source;

    public EncryptionDecorator(DataSource source)
    {
        this.source = source;
    }

    public void writeData(String data)
    {
        String encrypted = encrypt(data);
        source.writeData(encrypted);
    }


    public String encrypt(String data) 
    {
        return encrypteddata;
    }

    public  String readData()
    {
        String data = source.readData();
        return decrypt( data );
    }

    public String decrypt( String data)
    {
        return decryptedData;
    }

}


class CompressionDecorator implements DataSource
{
    private DataSource source;

    public CompressionDecorator(DataSource source)
    {
        this.source = source;
    }

    public void writeData(String data)
    {
        return compressedData;
    }

    public String readData()
    {
        String data = source.readData();
        return decompressed(data);
    }


    private decompressed(String data) {
        return decompressedData;
    }
}

// use

DataSource  source = new FileDataSource("data.txt");

source = new EncryptionDecorator( source);
source = new CompressionDecorator( source);
source.writeData("LPU Training");
