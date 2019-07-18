import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.m;
import java.security.MessageDigest;

public class ki
  implements m<hi>
{
  private final m<Bitmap> a;
  
  public ki(m<Bitmap> paramm)
  {
    Nj.a(paramm);
    this.a = ((m)paramm);
  }
  
  public Wf<hi> a(Context paramContext, Wf<hi> paramWf, int paramInt1, int paramInt2)
  {
    hi localhi = (hi)paramWf.get();
    Object localObject = Ae.a(paramContext).c();
    localObject = new xh(localhi.c(), (eg)localObject);
    paramContext = this.a.a(paramContext, (Wf)localObject, paramInt1, paramInt2);
    if (!localObject.equals(paramContext)) {
      ((Wf)localObject).a();
    }
    paramContext = (Bitmap)paramContext.get();
    localhi.a(this.a, paramContext);
    return paramWf;
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    this.a.a(paramMessageDigest);
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof ki))
    {
      paramObject = (ki)paramObject;
      return this.a.equals(((ki)paramObject).a);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */