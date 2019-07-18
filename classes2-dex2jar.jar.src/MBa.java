import java.util.concurrent.ThreadFactory;

final class mBa
  implements ThreadFactory
{
  public static final mBa a = new mBa();
  
  public final Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, "FaceAppImageProcessingThread");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */