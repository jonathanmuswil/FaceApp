public abstract class XIa$c
{
  public static final class a
    extends XIa.c
  {
    private final Mka a;
    
    public a(Mka paramMka)
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
      localStringBuilder.append("InviteToPoll(poll=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends XIa.c
  {
    private final Mka a;
    
    public b(Mka paramMka)
    {
      super();
      this.a = paramMka;
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
      localStringBuilder.append("PollMenuClick(poll=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends XIa.c
  {
    public static final c a = new c();
    
    private c()
    {
      super();
    }
  }
  
  public static final class d
    extends XIa.c
  {
    public static final d a = new d();
    
    private d()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/XIa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */