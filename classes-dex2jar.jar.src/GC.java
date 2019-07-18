import android.os.IBinder;

class gc
  implements ic
{
  private final IBinder a;
  
  gc(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof gc)) && (((gc)paramObject).a.equals(this.a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */