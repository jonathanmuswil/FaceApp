import android.os.Bundle;

class Oc$b
  implements Runnable
{
  final int a;
  final Bundle b;
  
  Oc$b(Oc paramOc, int paramInt, Bundle paramBundle)
  {
    this.a = paramInt;
    this.b = paramBundle;
  }
  
  public void run()
  {
    this.c.a(this.a, this.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Oc$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */