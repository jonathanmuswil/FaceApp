package com.google.android.gms.common.api.internal;

public final class i<L>
{
  private volatile L a;
  
  public final void a()
  {
    this.a = null;
  }
  
  public static final class a<L>
  {
    private final L a;
    private final String b;
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      return (this.a == ((a)paramObject).a) && (this.b.equals(((a)paramObject).b));
    }
    
    public final int hashCode()
    {
      return System.identityHashCode(this.a) * 31 + this.b.hashCode();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */