package android.support.v7.app;

class q
  implements Runnable
{
  q(x paramx) {}
  
  public void run()
  {
    x localx = this.a;
    if ((localx.P & 0x1) != 0) {
      localx.e(0);
    }
    localx = this.a;
    if ((localx.P & 0x1000) != 0) {
      localx.e(108);
    }
    localx = this.a;
    localx.O = false;
    localx.P = 0;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */