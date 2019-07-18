public abstract interface hKa
  extends sla, jta<hKa.c>
{
  public abstract void O();
  
  public abstract void X();
  
  public abstract void b(String paramString, Rka paramRka);
  
  public abstract QQa<hKa.b> getViewActions();
  
  public abstract void i(String paramString);
  
  public abstract void j(String paramString);
  
  public abstract void k(String paramString);
  
  public static enum a
  {
    static
    {
      a locala1 = new a("FEED", 0);
      a = locala1;
      a locala2 = new a("MY_STYLES", 1);
      b = locala2;
      a locala3 = new a("UPDATES", 2);
      c = locala3;
      d = new a[] { locala1, locala2, locala3 };
    }
    
    private a() {}
  }
  
  public static abstract class b
  {
    public static final class a
      extends hKa.b
    {
      private final Rja a;
      
      public a(Rja paramRja)
      {
        super();
        this.a = paramRja;
      }
      
      public final Rja a()
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
        Rja localRja = this.a;
        int i;
        if (localRja != null) {
          i = localRja.hashCode();
        } else {
          i = 0;
        }
        return i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("CreateFirstPoll(imageDesc=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends hKa.b
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends hKa.b
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends hKa.b
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
        localStringBuilder.append("PollDeleted(pollId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class e
      extends hKa.b
    {
      private final String a;
      private final Rka b;
      
      public e(String paramString, Rka paramRka)
      {
        super();
        this.a = paramString;
        this.b = paramRka;
      }
      
      public final Rka a()
      {
        return this.b;
      }
      
      public final String b()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof e))
          {
            paramObject = (e)paramObject;
            if ((oXa.a(this.a, ((e)paramObject).a)) && (oXa.a(this.b, ((e)paramObject).b))) {}
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
        Object localObject = this.a;
        int i = 0;
        int j;
        if (localObject != null) {
          j = ((String)localObject).hashCode();
        } else {
          j = 0;
        }
        localObject = this.b;
        if (localObject != null) {
          i = ((Rka)localObject).hashCode();
        }
        return j * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("PollVoted(pollId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", newVote=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class f
      extends hKa.b
    {
      public static final f a = new f();
      
      private f()
      {
        super();
      }
    }
    
    public static final class g
      extends hKa.b
    {
      private final String a;
      
      public g(String paramString)
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
          if ((paramObject instanceof g))
          {
            paramObject = (g)paramObject;
            if (oXa.a(this.a, ((g)paramObject).a)) {}
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
        localStringBuilder.append("ShowSinglePollRequested(pollId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class h
      extends hKa.b
    {
      private final String a;
      
      public h(String paramString)
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
          if ((paramObject instanceof h))
          {
            paramObject = (h)paramObject;
            if (oXa.a(this.a, ((h)paramObject).a)) {}
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
        localStringBuilder.append("ShowVotingRequested(pollId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
  
  public static abstract class c
  {
    public static final class a
      extends hKa.c
    {
      private final dka a;
      private final int b;
      
      public a(dka paramdka, int paramInt)
      {
        super();
        this.a = paramdka;
        this.b = paramInt;
      }
      
      public final int a()
      {
        return this.b;
      }
      
      public final dka b()
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
        dka localdka = this.a;
        int i;
        if (localdka != null) {
          i = localdka.hashCode();
        } else {
          i = 0;
        }
        return i * 31 + this.b;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Logged(user=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", unreadUpdates=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends hKa.c
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hKa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */