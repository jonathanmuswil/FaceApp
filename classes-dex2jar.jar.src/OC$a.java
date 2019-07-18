import android.os.Bundle;
import android.os.Handler;

class Oc$a
  extends Jc.a
{
  Oc$a(Oc paramOc) {}
  
  public void a(int paramInt, Bundle paramBundle)
  {
    Oc localOc = this.a;
    Handler localHandler = localOc.b;
    if (localHandler != null) {
      localHandler.post(new Oc.b(localOc, paramInt, paramBundle));
    } else {
      localOc.a(paramInt, paramBundle);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Oc$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */