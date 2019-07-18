import android.net.Uri;

public abstract interface bOa
  extends sla, jta<bOa.c>
{
  public abstract void da();
  
  public abstract QQa<bOa.b> getViewActions();
  
  public static abstract interface a
  {
    public abstract void b(Uri paramUri);
  }
  
  public static abstract class b
  {
    public static final class a
      extends bOa.b
    {
      private final float a;
      private final float b;
      
      public a(float paramFloat1, float paramFloat2)
      {
        super();
        this.a = paramFloat1;
        this.b = paramFloat2;
      }
      
      public final float a()
      {
        return this.b;
      }
      
      public final float b()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            if ((Float.compare(this.a, ((a)paramObject).a) == 0) && (Float.compare(this.b, ((a)paramObject).b) == 0)) {}
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
        return Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b);
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Crop(wScroll=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", hScroll=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
  
  public static abstract class c
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bOa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */