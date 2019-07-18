import com.android.billingclient.api.D;
import com.android.billingclient.api.F;

public final class yia
{
  public static final String a(D paramD)
  {
    oXa.b(paramD, "$this$info");
    Object localObject = paramD.a();
    int i;
    if ((localObject != null) && (((CharSequence)localObject).length() != 0)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      localObject = "";
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(" - ");
      ((StringBuilder)localObject).append(paramD.a());
      localObject = ((StringBuilder)localObject).toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(ija.a.a(paramD.b()));
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  public static final String a(F paramF)
  {
    oXa.b(paramF, "$this$info");
    Object localObject = ija.a.b(paramF.c());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Purchase([sku]: ");
    localStringBuilder.append(paramF.f());
    localStringBuilder.append(" [orderId]: ");
    localStringBuilder.append(paramF.a());
    localStringBuilder.append(" [purchaseState]: ");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" [tokenLen]: ");
    localObject = paramF.d();
    if (localObject != null) {
      localObject = Integer.valueOf(((String)localObject).length());
    } else {
      localObject = null;
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(" [autoRenewing]: ");
    localStringBuilder.append(paramF.h());
    localStringBuilder.append(" [isAcknowledged]: ");
    localStringBuilder.append(paramF.g());
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */