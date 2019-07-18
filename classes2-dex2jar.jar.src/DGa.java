import android.net.Uri;
import io.faceapp.ui.misc.c;
import io.faceapp.ui.misc.c.a;
import java.util.List;

public abstract interface dGa
  extends aEa, jta<dGa.d>, c
{
  public abstract void a(float paramFloat);
  
  public abstract void a(c.a parama);
  
  public abstract QQa<dGa.c> getViewActions();
  
  public static final class a
  {
    public static void a(dGa paramdGa, c.a parama, Object paramObject)
    {
      oXa.b(parama, "model");
      paramdGa.a(parama);
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends dGa.b
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
        localStringBuilder.append("Downloading(progress=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends dGa.b
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends dGa.b
    {
      private final Uri a;
      
      public c(Uri paramUri)
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
        localStringBuilder.append("Ready(imageUri=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
  
  public static abstract class c
  {
    public static final class a
      extends dGa.c
    {
      private final int a;
      
      public a(int paramInt)
      {
        super();
        this.a = paramInt;
      }
      
      public final int a()
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
            if (i != 0) {}
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
        return this.a;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("PartClicked(partIndex=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
  
  public static abstract class d
  {
    public static final class a
      extends dGa.d
    {
      private final List<dGa.b> a;
      private final boolean b;
      
      public a(List<? extends dGa.b> paramList, boolean paramBoolean)
      {
        super();
        this.a = paramList;
        this.b = paramBoolean;
      }
      
      public final List<dGa.b> a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject)
        {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            if (oXa.a(this.a, ((a)paramObject).a))
            {
              int i;
              if (this.b == ((a)paramObject).b) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label58;
              }
            }
          }
          return false;
        }
        label58:
        return true;
      }
      
      public int hashCode()
      {
        List localList = this.a;
        int i;
        if (localList != null) {
          i = localList.hashCode();
        } else {
          i = 0;
        }
        int j = this.b;
        int k = j;
        if (j != 0) {
          k = 1;
        }
        return i * 31 + k;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Content(parts=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", allFilled=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */