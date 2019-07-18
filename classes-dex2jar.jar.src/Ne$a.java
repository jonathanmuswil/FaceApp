import java.util.concurrent.ThreadFactory;

final class Ne$a
  implements ThreadFactory
{
  public Thread newThread(Runnable paramRunnable)
  {
    try
    {
      Thread localThread = new java/lang/Thread;
      localThread.<init>(paramRunnable, "glide-disk-lru-cache-thread");
      localThread.setPriority(1);
      return localThread;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ne$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */