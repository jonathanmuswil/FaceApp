import java.util.concurrent.ThreadFactory;

final class lBa
  implements ThreadFactory
{
  public static final lBa a = new lBa();
  
  public final Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, "FaceAppImageFileSavingThread");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */