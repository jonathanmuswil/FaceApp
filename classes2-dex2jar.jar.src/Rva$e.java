import io.faceapp.ui.misc.c.a;

public abstract class Rva$e
{
  public static final class a
    extends Rva.e
  {
    private final float a;
    
    public a(float paramFloat)
    {
      super();
      this.a = paramFloat;
    }
    
    public final float a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (Float.compare(this.a, ((a)paramObject).a) == 0) {}
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
      return Float.floatToIntBits(this.a);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Loading(progress=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends Rva.e
  {
    private final c.a a;
    
    public b(c.a parama)
    {
      super();
      this.a = parama;
    }
    
    public final c.a a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if (oXa.a(this.a, ((b)paramObject).a)) {}
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
      c.a locala = this.a;
      int i;
      if (locala != null) {
        i = locala.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("NetworkError(error=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends Rva.e
  {
    private final Mka a;
    
    public c(Mka paramMka)
    {
      super();
      this.a = paramMka;
    }
    
    public final Mka a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if (oXa.a(this.a, ((c)paramObject).a)) {}
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
      Mka localMka = this.a;
      int i;
      if (localMka != null) {
        i = localMka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Ready(createdPoll=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Rva$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */