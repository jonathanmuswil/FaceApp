import android.support.v4.app.l;
import android.view.View;

final class vHa<T>
  implements ARa<Boolean>
{
  vHa(tHa paramtHa) {}
  
  public final void a(Boolean paramBoolean)
  {
    oXa.a(paramBoolean, "it");
    if (paramBoolean.booleanValue())
    {
      long l1 = 'Ĭ';
      long l2 = System.nanoTime();
      long l3 = 'Ϩ';
      paramBoolean = this.a.eb();
      if (paramBoolean != null) {
        paramBoolean.postDelayed(new uHa(this), l1 + l2 % l3);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */