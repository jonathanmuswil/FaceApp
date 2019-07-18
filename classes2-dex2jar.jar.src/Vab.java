import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class vab
{
  static final Logger a = Logger.getLogger(vab.class.getName());
  
  public static Dab a(File paramFile)
    throws FileNotFoundException
  {
    if (paramFile != null) {
      return a(new FileOutputStream(paramFile));
    }
    throw new IllegalArgumentException("file == null");
  }
  
  public static Dab a(OutputStream paramOutputStream)
  {
    return a(paramOutputStream, new Gab());
  }
  
  private static Dab a(OutputStream paramOutputStream, Gab paramGab)
  {
    if (paramOutputStream != null)
    {
      if (paramGab != null) {
        return new sab(paramGab, paramOutputStream);
      }
      throw new IllegalArgumentException("timeout == null");
    }
    throw new IllegalArgumentException("out == null");
  }
  
  public static Dab a(Socket paramSocket)
    throws IOException
  {
    if (paramSocket != null)
    {
      if (paramSocket.getOutputStream() != null)
      {
        fab localfab = c(paramSocket);
        return localfab.a(a(paramSocket.getOutputStream(), localfab));
      }
      throw new IOException("socket's output stream == null");
    }
    throw new IllegalArgumentException("socket == null");
  }
  
  public static Eab a(InputStream paramInputStream)
  {
    return a(paramInputStream, new Gab());
  }
  
  private static Eab a(InputStream paramInputStream, Gab paramGab)
  {
    if (paramInputStream != null)
    {
      if (paramGab != null) {
        return new tab(paramGab, paramInputStream);
      }
      throw new IllegalArgumentException("timeout == null");
    }
    throw new IllegalArgumentException("in == null");
  }
  
  public static kab a(Dab paramDab)
  {
    return new xab(paramDab);
  }
  
  public static lab a(Eab paramEab)
  {
    return new zab(paramEab);
  }
  
  static boolean a(AssertionError paramAssertionError)
  {
    boolean bool;
    if ((paramAssertionError.getCause() != null) && (paramAssertionError.getMessage() != null) && (paramAssertionError.getMessage().contains("getsockname failed"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static Eab b(Socket paramSocket)
    throws IOException
  {
    if (paramSocket != null)
    {
      if (paramSocket.getInputStream() != null)
      {
        fab localfab = c(paramSocket);
        return localfab.a(a(paramSocket.getInputStream(), localfab));
      }
      throw new IOException("socket's input stream == null");
    }
    throw new IllegalArgumentException("socket == null");
  }
  
  private static fab c(Socket paramSocket)
  {
    return new uab(paramSocket);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */