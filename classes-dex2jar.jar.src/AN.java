import android.content.Intent;
import com.facebook.accountkit.internal.Y;
import java.util.Collections;
import java.util.List;

public abstract class an
  extends tn
{
  protected List<String> a()
  {
    return Collections.singletonList("com.facebook.accountkit.sdk.ACTION_EMAIL_LOGIN_STATE_CHANGED");
  }
  
  protected abstract void a(Wm paramWm);
  
  protected abstract void a(Zm paramZm);
  
  protected void a(Intent paramIntent)
  {
    Zm localZm = (Zm)paramIntent.getParcelableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_MODEL");
    Y localY = (Y)paramIntent.getSerializableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_STATUS");
    if ((localZm != null) && (localY != null))
    {
      int i = _m.a[localY.ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i == 5)
              {
                paramIntent = (Vm)paramIntent.getParcelableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_ERROR");
                if (paramIntent != null) {
                  a(new Wm(paramIntent));
                }
              }
            }
            else {
              b(localZm);
            }
          }
          else {
            d(localZm);
          }
        }
        else {
          a(localZm);
        }
      }
      else {
        c(localZm);
      }
    }
  }
  
  protected abstract void b(Zm paramZm);
  
  protected abstract void c(Zm paramZm);
  
  protected abstract void d(Zm paramZm);
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */