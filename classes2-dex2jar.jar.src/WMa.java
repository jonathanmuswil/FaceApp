final class wMa
  extends pXa
  implements cXa<Yka, Boolean>
{
  wMa(String paramString)
  {
    super(1);
  }
  
  public final boolean a(Yka paramYka)
  {
    oXa.b(paramYka, "update");
    boolean bool;
    if ((paramYka instanceof Vka))
    {
      bool = oXa.a(((Vka)paramYka).d().l(), this.b);
    }
    else if ((paramYka instanceof Wka))
    {
      bool = oXa.a(((Wka)paramYka).d().l(), this.b);
    }
    else
    {
      if (!(paramYka instanceof Xka)) {
        break label89;
      }
      bool = oXa.a(((Xka)paramYka).d().l(), this.b);
    }
    return bool;
    label89:
    throw new IllegalArgumentException("unhandled Update type");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wMa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */