package android.arch.lifecycle;

public class r
{
  private final a a;
  private final s b;
  
  public r(s params, a parama)
  {
    this.a = parama;
    this.b = params;
  }
  
  public <T extends q> T a(Class<T> paramClass)
  {
    String str = paramClass.getCanonicalName();
    if (str != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
      localStringBuilder.append(str);
      return a(localStringBuilder.toString(), paramClass);
    }
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  public <T extends q> T a(String paramString, Class<T> paramClass)
  {
    q localq = this.b.a(paramString);
    if (paramClass.isInstance(localq)) {
      return localq;
    }
    paramClass = this.a.a(paramClass);
    this.b.a(paramString, paramClass);
    return paramClass;
  }
  
  public static abstract interface a
  {
    public abstract <T extends q> T a(Class<T> paramClass);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */