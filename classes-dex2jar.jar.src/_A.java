import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class _a
{
  static long a(File paramFile)
    throws IOException
  {
    paramFile = new RandomAccessFile(paramFile, "r");
    try
    {
      long l = a(paramFile, a(paramFile));
      return l;
    }
    finally
    {
      paramFile.close();
    }
  }
  
  static long a(RandomAccessFile paramRandomAccessFile, _a.a parama)
    throws IOException
  {
    CRC32 localCRC32 = new CRC32();
    long l = parama.b;
    paramRandomAccessFile.seek(parama.a);
    int i = (int)Math.min(16384L, l);
    parama = new byte['䀀'];
    for (i = paramRandomAccessFile.read(parama, 0, i); i != -1; i = paramRandomAccessFile.read(parama, 0, (int)Math.min(16384L, l)))
    {
      localCRC32.update(parama, 0, i);
      l -= i;
      if (l == 0L) {
        break;
      }
    }
    return localCRC32.getValue();
  }
  
  static _a.a a(RandomAccessFile paramRandomAccessFile)
    throws IOException, ZipException
  {
    long l1 = paramRandomAccessFile.length() - 22L;
    long l2 = 0L;
    if (l1 >= 0L)
    {
      long l3 = l1 - 65536L;
      if (l3 >= 0L) {
        l2 = l3;
      }
      int i = Integer.reverseBytes(101010256);
      do
      {
        paramRandomAccessFile.seek(l1);
        if (paramRandomAccessFile.readInt() == i)
        {
          paramRandomAccessFile.skipBytes(2);
          paramRandomAccessFile.skipBytes(2);
          paramRandomAccessFile.skipBytes(2);
          paramRandomAccessFile.skipBytes(2);
          localObject = new _a.a();
          ((_a.a)localObject).b = (Integer.reverseBytes(paramRandomAccessFile.readInt()) & 0xFFFFFFFF);
          ((_a.a)localObject).a = (Integer.reverseBytes(paramRandomAccessFile.readInt()) & 0xFFFFFFFF);
          return (_a.a)localObject;
        }
        l1 -= 1L;
      } while (l1 >= l2);
      throw new ZipException("End Of Central Directory signature not found");
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("File too short to be a zip file: ");
    ((StringBuilder)localObject).append(paramRandomAccessFile.length());
    throw new ZipException(((StringBuilder)localObject).toString());
  }
  
  static class a
  {
    long a;
    long b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */