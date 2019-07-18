import java.util.NoSuchElementException;

public final class Zma$a
{
  public static final class a
  {
    private final long a;
    private final Zma.a.b b;
    
    public a()
    {
      this(0L, null, 3, null);
    }
    
    public a(long paramLong, Zma.a.b paramb)
    {
      this.a = paramLong;
      this.b = paramb;
    }
    
    public final a a(long paramLong, Zma.a.b paramb)
    {
      oXa.b(paramb, "faceDetectionState");
      return new a(paramLong, paramb);
    }
    
    public final Zma.a.b a()
    {
      return this.b;
    }
    
    public final long b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          int i;
          if (this.a == ((a)paramObject).a) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.b, ((a)paramObject).b))) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public int hashCode()
    {
      long l = this.a;
      int i = (int)(l ^ l >>> 32);
      Zma.a.b localb = this.b;
      int j;
      if (localb != null) {
        j = localb.hashCode();
      } else {
        j = 0;
      }
      return i * 31 + j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("FaceCacheEntity(lastUsedDate=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", faceDetectionState=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static enum b
  {
    public static final Zma.a.b.a f = new Zma.a.b.a(null);
    private final int g;
    
    static
    {
      b localb1 = new b("UNKNOWN", 0, -1);
      a = localb1;
      b localb2 = new b("NO_FACE", 1, 0);
      b = localb2;
      b localb3 = new b("HAS_FACE", 2, 1);
      c = localb3;
      b localb4 = new b("FACEAPP_GENERATED", 3, 2);
      d = localb4;
      e = new b[] { localb1, localb2, localb3, localb4 };
    }
    
    private b(int paramInt)
    {
      this.g = paramInt;
    }
    
    public final int getId()
    {
      return this.g;
    }
    
    public static final class a
    {
      public final Zma.a.b a(int paramInt)
      {
        for (Zma.a.b localb : )
        {
          int k;
          if (localb.getId() == paramInt) {
            k = 1;
          } else {
            k = 0;
          }
          if (k != 0) {
            return localb;
          }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Zma$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */