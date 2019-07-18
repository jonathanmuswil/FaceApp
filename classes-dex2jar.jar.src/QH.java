import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.j;
import java.io.InputStream;

public class qh
  implements ch<Uri, InputStream>
{
  private final Context a;
  
  public qh(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  private boolean a(j paramj)
  {
    paramj = (Long)paramj.a(Vh.a);
    boolean bool;
    if ((paramj != null) && (paramj.longValue() == -1L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public ch.a<InputStream> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    if ((lf.a(paramInt1, paramInt2)) && (a(paramj))) {
      return new ch.a(new Bj(paramUri), mf.b(this.a, paramUri));
    }
    return null;
  }
  
  public boolean a(Uri paramUri)
  {
    return lf.c(paramUri);
  }
  
  public static class a
    implements dh<Uri, InputStream>
  {
    private final Context a;
    
    public a(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public ch<Uri, InputStream> a(gh paramgh)
    {
      return new qh(this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */