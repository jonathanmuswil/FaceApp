import android.os.Bundle;

public final class zv
{
  private final Bundle a;
  
  public zv()
  {
    this(new Bundle());
  }
  
  public zv(Bundle paramBundle)
  {
    this.a = ((Bundle)paramBundle.clone());
  }
  
  public final float a(String paramString, float paramFloat)
  {
    return this.a.getFloat(paramString, paramFloat);
  }
  
  public final int a(String paramString, int paramInt)
  {
    return this.a.getInt(paramString, paramInt);
  }
  
  public final boolean a(String paramString)
  {
    return this.a.containsKey(paramString);
  }
  
  public final boolean a(String paramString, boolean paramBoolean)
  {
    return this.a.getBoolean(paramString, paramBoolean);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */