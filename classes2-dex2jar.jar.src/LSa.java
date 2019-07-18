import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.d;

final class lsa
  implements jP
{
  public static final lsa a = new lsa();
  
  public final void a(Exception paramException)
  {
    oXa.b(paramException, "ex");
    Object localObject1;
    Object localObject2;
    if ((paramException instanceof b))
    {
      localObject1 = (b)paramException;
      paramException = d.a(((b)localObject1).a());
      oXa.a(paramException, "CommonStatusCodes.getSta…CodeString(ex.statusCode)");
      localObject1 = ((b)localObject1).b();
      localObject2 = icb.a("SafetyNet");
      Object localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("Token request failed, [code]: ");
      ((StringBuilder)localObject3).append(paramException);
      ((StringBuilder)localObject3).append(" [message]: ");
      ((StringBuilder)localObject3).append((String)localObject1);
      ((icb.a)localObject2).a(((StringBuilder)localObject3).toString(), new Object[0]);
      localObject3 = asa.d;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Request failed [");
      ((StringBuilder)localObject2).append(paramException);
      ((StringBuilder)localObject2).append("]:[");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(']');
      ((asa)localObject3).j(((StringBuilder)localObject2).toString());
    }
    else
    {
      localObject2 = icb.a("SafetyNet");
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Token request failed, unknown error, [message]: ");
      ((StringBuilder)localObject1).append(paramException.getMessage());
      ((icb.a)localObject2).a(((StringBuilder)localObject1).toString(), new Object[0]);
      localObject1 = asa.d;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Request failed [unknown error]:[");
      ((StringBuilder)localObject2).append(paramException.getMessage());
      ((StringBuilder)localObject2).append(']');
      ((asa)localObject1).j(((StringBuilder)localObject2).toString());
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */