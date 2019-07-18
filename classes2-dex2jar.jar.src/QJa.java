public abstract interface qJa
  extends XIa
{
  public abstract QQa<qJa.a> A();
  
  public abstract void a(String paramString, Rka paramRka);
  
  public abstract void b(String paramString);
  
  public abstract void o();
  
  public abstract JVa<qJa.b> v();
  
  public static abstract class a
  {
    public static final class a
      extends qJa.a
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
        localStringBuilder.append("PollClicked(poll=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends qJa.a
    {
      private final String a;
      
      public b(String paramString)
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
    
    public static final class c
      extends qJa.a
    {
      private final String a;
      private final Rka b;
      
      public c(String paramString, Rka paramRka)
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
          if ((paramObject instanceof c))
          {
            paramObject = (c)paramObject;
            if ((oXa.a(this.a, ((c)paramObject).a)) && (oXa.a(this.b, ((c)paramObject).b))) {}
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
  }
  
  public static abstract class b
  {
    public static final class a
      extends qJa.b
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends qJa.b
    {
      private final String a;
      
      public b(String paramString)
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
        localStringBuilder.append("ShowSinglePoll(pollId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class c
      extends qJa.b
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
        localStringBuilder.append("ShowVoting(pollId=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qJa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */