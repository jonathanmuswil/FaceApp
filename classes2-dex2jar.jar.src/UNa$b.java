import android.net.Uri;

public abstract class UNa$b
{
  public static final class a
    extends UNa.b
  {
    private final boolean a;
    
    public a(boolean paramBoolean)
    {
      super();
      this.a = paramBoolean;
    }
    
    public final boolean a()
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
      int i = this.a;
      int j = i;
      if (i != 0) {
        j = 1;
      }
      return j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AuthHappened(success=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends UNa.b
  {
    private final boolean a;
    
    public b(boolean paramBoolean)
    {
      super();
      this.a = paramBoolean;
    }
    
    public final boolean a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          int i;
          if (this.a == ((b)paramObject).a) {
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
      int i = this.a;
      int j = i;
      if (i != 0) {
        j = 1;
      }
      return j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Dismiss(confirmed=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends UNa.b
  {
    private final String a;
    
    public c(String paramString)
    {
      super();
      this.a = paramString;
    }
    
    public final String a()
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
      String str = this.a;
      int i;
      if (str != null) {
        i = str.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("FirstNameChanged(newFirstName=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends UNa.b
  {
    private final String a;
    
    public d(String paramString)
    {
      super();
      this.a = paramString;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof d))
        {
          paramObject = (d)paramObject;
          if (oXa.a(this.a, ((d)paramObject).a)) {}
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
      String str = this.a;
      int i;
      if (str != null) {
        i = str.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("LastNameChanged(newLastName=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class e
    extends UNa.b
  {
    public static final e a = new e();
    
    private e()
    {
      super();
    }
  }
  
  public static final class f
    extends UNa.b
  {
    public static final f a = new f();
    
    private f()
    {
      super();
    }
  }
  
  public static final class g
    extends UNa.b
  {
    private final boolean a;
    
    public g(boolean paramBoolean)
    {
      super();
      this.a = paramBoolean;
    }
    
    public final boolean a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof g))
        {
          paramObject = (g)paramObject;
          int i;
          if (this.a == ((g)paramObject).a) {
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
      int i = this.a;
      int j = i;
      if (i != 0) {
        j = 1;
      }
      return j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("LogoutEverywhere(confirmed=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class h
    extends UNa.b
  {
    private final String a;
    private final boolean b;
    
    public h(String paramString, boolean paramBoolean)
    {
      super();
      this.a = paramString;
      this.b = paramBoolean;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public final boolean b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof h))
        {
          paramObject = (h)paramObject;
          if (oXa.a(this.a, ((h)paramObject).a))
          {
            int i;
            if (this.b == ((h)paramObject).b) {
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
      String str = this.a;
      int i;
      if (str != null) {
        i = str.hashCode();
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
      localStringBuilder.append("LogoutFacebook(accountId=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", confirmed=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class i
    extends UNa.b
  {
    private final String a;
    private final boolean b;
    
    public i(String paramString, boolean paramBoolean)
    {
      super();
      this.a = paramString;
      this.b = paramBoolean;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public final boolean b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof i))
        {
          paramObject = (i)paramObject;
          if (oXa.a(this.a, ((i)paramObject).a))
          {
            int i;
            if (this.b == ((i)paramObject).b) {
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
      String str = this.a;
      int i;
      if (str != null) {
        i = str.hashCode();
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
      localStringBuilder.append("LogoutPhoneNumber(accountId=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", confirmed=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class j
    extends UNa.b
  {
    public static final j a = new j();
    
    private j()
    {
      super();
    }
  }
  
  public static final class k
    extends UNa.b
  {
    private final Uri a;
    private final boolean b;
    
    public k(Uri paramUri, boolean paramBoolean)
    {
      super();
      this.a = paramUri;
      this.b = paramBoolean;
    }
    
    public final boolean a()
    {
      return this.b;
    }
    
    public final Uri b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof k))
        {
          paramObject = (k)paramObject;
          if (oXa.a(this.a, ((k)paramObject).a))
          {
            int i;
            if (this.b == ((k)paramObject).b) {
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
      Uri localUri = this.a;
      int i;
      if (localUri != null) {
        i = localUri.hashCode();
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
      localStringBuilder.append("NewAvatarSelected(imageUri=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", cropped=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class l
    extends UNa.b
  {
    public static final l a = new l();
    
    private l()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/UNa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */