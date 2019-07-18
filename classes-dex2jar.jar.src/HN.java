import android.content.Intent;
import com.facebook.accountkit.internal.Y;
import java.util.Collections;
import java.util.List;

public abstract class hn
  extends tn
{
  private String e;
  
  protected List<String> a()
  {
    return Collections.singletonList("com.facebook.accountkit.sdk.ACTION_PHONE_LOGIN_STATE_CHANGED");
  }
  
  protected abstract void a(Wm paramWm);
  
  protected void a(Intent paramIntent)
  {
    fn localfn = (fn)paramIntent.getParcelableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_MODEL");
    Y localY = (Y)paramIntent.getSerializableExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_STATUS");
    if ((localfn != null) && (localY != null))
    {
      int i = gn.a[localY.ordinal()];
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
                if (paramIntent != null)
                {
                  a("");
                  a(new Wm(paramIntent));
                }
              }
            }
            else {
              b(localfn);
            }
          }
          else {
            d(localfn);
          }
        }
        else {
          a(localfn);
        }
      }
      else {
        c(localfn);
      }
    }
  }
  
  protected abstract void a(fn paramfn);
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  protected abstract void b(fn paramfn);
  
  protected abstract void c(fn paramfn);
  
  protected abstract void d(fn paramfn);
  
  public String h()
  {
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */