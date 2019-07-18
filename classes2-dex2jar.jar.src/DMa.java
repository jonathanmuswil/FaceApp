import io.faceapp.m;

final class dMa
  implements Runnable
{
  dMa(eMa parameMa) {}
  
  public final void run()
  {
    m localm = this.a.getRouter();
    if (localm != null) {
      localm.b();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dMa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */