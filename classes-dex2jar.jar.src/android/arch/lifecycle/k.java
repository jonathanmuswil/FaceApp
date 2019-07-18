package android.arch.lifecycle;

class k
  implements Runnable
{
  k(LiveData paramLiveData) {}
  
  public void run()
  {
    synchronized (LiveData.a(this.a))
    {
      Object localObject2 = LiveData.b(this.a);
      LiveData.a(this.a, LiveData.a());
      this.a.b(localObject2);
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */