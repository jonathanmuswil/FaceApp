import com.android.billingclient.api.I;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Currency;

public final class ija
{
  public static final ija a = new ija();
  
  public final WVa<String, String> a(I paramI1, int paramInt, I paramI2)
  {
    oXa.b(paramI1, "skuDetails");
    oXa.b(paramI2, "targetRoundingSku");
    if (paramI2.a() % 1000000 == 0L) {
      paramI2 = Integer.valueOf(0);
    } else {
      paramI2 = null;
    }
    return a(paramI1, paramInt, paramI2);
  }
  
  public final WVa<String, String> a(I paramI, int paramInt, Integer paramInteger)
  {
    oXa.b(paramI, "skuDetails");
    Currency localCurrency = Currency.getInstance(paramI.b());
    double d = paramI.a() / 1000000 / paramInt;
    if (paramInteger != null)
    {
      paramInt = paramInteger.intValue();
    }
    else
    {
      oXa.a(localCurrency, "currency");
      paramInt = Math.max(0, localCurrency.getDefaultFractionDigits());
    }
    if (paramInt == 0) {
      paramInt = 1;
    } else {
      paramInt += 2;
    }
    paramI = "#.###############".substring(0, paramInt);
    oXa.a(paramI, "(this as java.lang.Strin…ing(startIndex, endIndex)");
    paramI = new DecimalFormat(paramI);
    paramI.setRoundingMode(RoundingMode.HALF_UP);
    paramInteger = paramI.format(d);
    paramI = jja.b;
    oXa.a(localCurrency, "currency");
    return new WVa(paramI.a(localCurrency), paramInteger);
  }
  
  public final String a(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "Unknown Unlisted Error";
      break;
    case 8: 
      str = "ITEM_NOT_OWNED";
      break;
    case 7: 
      str = "ITEM_ALREADY_OWNED";
      break;
    case 6: 
      str = "ERROR";
      break;
    case 5: 
      str = "DEVELOPER_ERROR";
      break;
    case 4: 
      str = "ITEM_UNAVAILABLE";
      break;
    case 3: 
      str = "BILLING_UNAVAILABLE";
      break;
    case 2: 
      str = "SERVICE_UNAVAILABLE";
      break;
    case 1: 
      str = "USER_CANCELED";
      break;
    case 0: 
      str = "OK";
      break;
    case -1: 
      str = "SERVICE_DISCONNECTED";
      break;
    case -2: 
      str = "FEATURE_NOT_SUPPORTED";
    }
    return str;
  }
  
  public final String b(int paramInt)
  {
    String str;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          str = "NameError";
        } else {
          str = "Pending";
        }
      }
      else {
        str = "Purchased";
      }
    }
    else {
      str = "Unspecified";
    }
    return str;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ija.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */