import com.google.android.gms.ads.b;
import com.google.android.gms.ads.f;

public final class oda
  extends b
{
  oda(hda.a.a parama, String paramString, cXa paramcXa, f paramf) {}
  
  public void a(int paramInt)
  {
    asa localasa = asa.d;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[id=");
    localStringBuilder.append(this.a);
    localStringBuilder.append('/');
    localStringBuilder.append(this.b);
    localStringBuilder.append("] failed to load");
    localasa.a(localStringBuilder.toString());
    hda.a(hda.c, paramInt);
  }
  
  public void d()
  {
    asa localasa = asa.d;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[id=");
    localStringBuilder.append(this.a);
    localStringBuilder.append('/');
    localStringBuilder.append(this.b);
    localStringBuilder.append("] loaded");
    localasa.a(localStringBuilder.toString());
    this.c.a(this.d);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */