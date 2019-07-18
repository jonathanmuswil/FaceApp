import java.util.concurrent.ThreadFactory;

class qf
  implements ThreadFactory
{
  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(new pf(this, paramRunnable), "glide-active-resources");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */