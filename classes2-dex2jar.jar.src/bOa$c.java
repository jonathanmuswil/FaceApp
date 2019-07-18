import android.net.Uri;

public abstract class bOa$c
{
  public static final class a
    extends bOa.c
  {
    private final Uri a;
    
    public a(Uri paramUri)
    {
      super();
      this.a = paramUri;
    }
    
    public final Uri a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.a, ((a)paramObject).a)) {}
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
      Uri localUri = this.a;
      int i;
      if (localUri != null) {
        i = localUri.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Content(imageUri=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bOa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */