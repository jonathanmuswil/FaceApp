import java.util.concurrent.TimeUnit;

final class aja<T, R>
  implements DRa<Throwable, aRa<? extends Boolean>>
{
  aja(bja parambja) {}
  
  public final aRa<? extends Boolean> a(Throwable paramThrowable)
  {
    oXa.b(paramThrowable, "error");
    if (paramThrowable == Rfa.f.e.e)
    {
      asa.a(asa.d, "VERIFY_TOKEN_FAILED", null, 2, null);
      paramThrowable = XQa.a(Boolean.valueOf(false));
    }
    else
    {
      paramThrowable = this.a;
      paramThrowable.a(paramThrowable.a() + 1);
      if (this.a.a() == 0)
      {
        paramThrowable = XQa.a(Integer.valueOf(0));
      }
      else
      {
        int i = this.a.a();
        paramThrowable = XQa.a(Math.min(60L, (float)Math.pow(2.0F, i - 1)), TimeUnit.SECONDS);
      }
      icb.a locala = icb.a("IAB");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("validatePlayStorePurchase failed on unknown reason, retry, [retryAttempt]: ");
      localStringBuilder.append(this.a.a() + 1);
      locala.a(localStringBuilder.toString(), new Object[0]);
      paramThrowable = paramThrowable.a(new _ia(this));
    }
    return paramThrowable;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/aja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */