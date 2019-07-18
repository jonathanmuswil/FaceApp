import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class tk
{
  private static final Set<String> a = new HashSet(Arrays.asList(new String[] { "app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter" }));
  
  private Double a(Object paramObject)
  {
    paramObject = String.valueOf(paramObject);
    if (paramObject == null) {
      return null;
    }
    return Double.valueOf((String)paramObject);
  }
  
  private String a(String paramString)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      String str = paramString.replaceAll("[^\\p{Alnum}_]+", "_");
      if ((!str.startsWith("ga_")) && (!str.startsWith("google_")) && (!str.startsWith("firebase_")))
      {
        paramString = str;
        if (Character.isLetter(str.charAt(0))) {}
      }
      else
      {
        paramString = new StringBuilder();
        paramString.append("fabric_");
        paramString.append(str);
        paramString = paramString.toString();
      }
      str = paramString;
      if (paramString.length() > 40) {
        str = paramString.substring(0, 40);
      }
      return str;
    }
    return "fabric_unnamed_parameter";
  }
  
  private String a(String paramString, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      j = paramString.hashCode();
      if (j != -902468296)
      {
        if (j != 103149417)
        {
          if ((j == 1743324417) && (paramString.equals("purchase")))
          {
            j = 0;
            break label84;
          }
        }
        else if (paramString.equals("login"))
        {
          j = 2;
          break label84;
        }
      }
      else if (paramString.equals("signUp"))
      {
        j = 1;
        break label84;
      }
      j = -1;
      label84:
      if (j != 0)
      {
        if (j != 1)
        {
          if (j == 2) {
            return "failed_login";
          }
        }
        else {
          return "failed_sign_up";
        }
      }
      else {
        return "failed_ecommerce_purchase";
      }
    }
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 1743324417: 
      if (paramString.equals("purchase")) {
        j = i;
      }
      break;
    case 1664021448: 
      if (paramString.equals("startCheckout")) {
        j = 2;
      }
      break;
    case 196004670: 
      if (paramString.equals("levelStart")) {
        j = 10;
      }
      break;
    case 109400031: 
      if (paramString.equals("share")) {
        j = 5;
      }
      break;
    case 103149417: 
      if (paramString.equals("login")) {
        j = 8;
      }
      break;
    case 23457852: 
      if (paramString.equals("addToCart")) {
        j = 1;
      }
      break;
    case -389087554: 
      if (paramString.equals("contentView")) {
        j = 3;
      }
      break;
    case -902468296: 
      if (paramString.equals("signUp")) {
        j = 7;
      }
      break;
    case -906336856: 
      if (paramString.equals("search")) {
        j = 4;
      }
      break;
    case -938102371: 
      if (paramString.equals("rating")) {
        j = 6;
      }
      break;
    case -1183699191: 
      if (paramString.equals("invite")) {
        j = 9;
      }
      break;
    case -2131650889: 
      if (paramString.equals("levelEnd")) {
        j = 11;
      }
      break;
    }
    int j = -1;
    switch (j)
    {
    default: 
      return c(paramString);
    case 11: 
      return "level_end";
    case 10: 
      return "level_start";
    case 9: 
      return "invite";
    case 8: 
      return "login";
    case 7: 
      return "sign_up";
    case 6: 
      return "rate_content";
    case 5: 
      return "share";
    case 4: 
      return "search";
    case 3: 
      return "select_content";
    case 2: 
      return "begin_checkout";
    case 1: 
      return "add_to_cart";
    }
    return "ecommerce_purchase";
  }
  
  private void a(Bundle paramBundle, String paramString, Double paramDouble)
  {
    paramDouble = a(paramDouble);
    if (paramDouble == null) {
      return;
    }
    paramBundle.putDouble(paramString, paramDouble.doubleValue());
  }
  
  private void a(Bundle paramBundle, String paramString, Integer paramInteger)
  {
    if (paramInteger == null) {
      return;
    }
    paramBundle.putInt(paramString, paramInteger.intValue());
  }
  
  private void a(Bundle paramBundle, String paramString, Long paramLong)
  {
    if (paramLong == null) {
      return;
    }
    paramBundle.putLong(paramString, paramLong.longValue());
  }
  
  private void a(Bundle paramBundle, String paramString1, String paramString2)
  {
    if (paramString2 == null) {
      return;
    }
    paramBundle.putString(paramString1, paramString2);
  }
  
  private void a(Bundle paramBundle, Map<String, Object> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      Object localObject = localEntry.getValue();
      String str = a((String)localEntry.getKey());
      if ((localObject instanceof String)) {
        paramBundle.putString(str, localEntry.getValue().toString());
      } else if ((localObject instanceof Double)) {
        paramBundle.putDouble(str, ((Double)localEntry.getValue()).doubleValue());
      } else if ((localObject instanceof Long)) {
        paramBundle.putLong(str, ((Long)localEntry.getValue()).longValue());
      } else if ((localObject instanceof Integer)) {
        paramBundle.putInt(str, ((Integer)localEntry.getValue()).intValue());
      }
    }
  }
  
  private Bundle b(Fk paramFk)
  {
    Bundle localBundle = new Bundle();
    if ("purchase".equals(paramFk.g))
    {
      a(localBundle, "item_id", (String)paramFk.h.get("itemId"));
      a(localBundle, "item_name", (String)paramFk.h.get("itemName"));
      a(localBundle, "item_category", (String)paramFk.h.get("itemType"));
      a(localBundle, "value", b(paramFk.h.get("itemPrice")));
      a(localBundle, "currency", (String)paramFk.h.get("currency"));
    }
    else if ("addToCart".equals(paramFk.g))
    {
      a(localBundle, "item_id", (String)paramFk.h.get("itemId"));
      a(localBundle, "item_name", (String)paramFk.h.get("itemName"));
      a(localBundle, "item_category", (String)paramFk.h.get("itemType"));
      a(localBundle, "price", b(paramFk.h.get("itemPrice")));
      a(localBundle, "value", b(paramFk.h.get("itemPrice")));
      a(localBundle, "currency", (String)paramFk.h.get("currency"));
      localBundle.putLong("quantity", 1L);
    }
    else if ("startCheckout".equals(paramFk.g))
    {
      a(localBundle, "quantity", Long.valueOf(((Integer)paramFk.h.get("itemCount")).intValue()));
      a(localBundle, "value", b(paramFk.h.get("totalPrice")));
      a(localBundle, "currency", (String)paramFk.h.get("currency"));
    }
    else if ("contentView".equals(paramFk.g))
    {
      a(localBundle, "content_type", (String)paramFk.h.get("contentType"));
      a(localBundle, "item_id", (String)paramFk.h.get("contentId"));
      a(localBundle, "item_name", (String)paramFk.h.get("contentName"));
    }
    else if ("search".equals(paramFk.g))
    {
      a(localBundle, "search_term", (String)paramFk.h.get("query"));
    }
    else if ("share".equals(paramFk.g))
    {
      a(localBundle, "method", (String)paramFk.h.get("method"));
      a(localBundle, "content_type", (String)paramFk.h.get("contentType"));
      a(localBundle, "item_id", (String)paramFk.h.get("contentId"));
      a(localBundle, "item_name", (String)paramFk.h.get("contentName"));
    }
    else if ("rating".equals(paramFk.g))
    {
      a(localBundle, "rating", String.valueOf(paramFk.h.get("rating")));
      a(localBundle, "content_type", (String)paramFk.h.get("contentType"));
      a(localBundle, "item_id", (String)paramFk.h.get("contentId"));
      a(localBundle, "item_name", (String)paramFk.h.get("contentName"));
    }
    else if ("signUp".equals(paramFk.g))
    {
      a(localBundle, "method", (String)paramFk.h.get("method"));
    }
    else if ("login".equals(paramFk.g))
    {
      a(localBundle, "method", (String)paramFk.h.get("method"));
    }
    else if ("invite".equals(paramFk.g))
    {
      a(localBundle, "method", (String)paramFk.h.get("method"));
    }
    else if ("levelStart".equals(paramFk.g))
    {
      a(localBundle, "level_name", (String)paramFk.h.get("levelName"));
    }
    else if ("levelEnd".equals(paramFk.g))
    {
      a(localBundle, "score", a(paramFk.h.get("score")));
      a(localBundle, "level_name", (String)paramFk.h.get("levelName"));
      a(localBundle, "success", b((String)paramFk.h.get("success")));
    }
    a(localBundle, paramFk.f);
    return localBundle;
  }
  
  private Double b(Object paramObject)
  {
    paramObject = (Long)paramObject;
    if (paramObject == null) {
      return null;
    }
    return Double.valueOf(new BigDecimal(((Long)paramObject).longValue()).divide(Xj.a).doubleValue());
  }
  
  private Integer b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Integer.valueOf(paramString.equals("true"));
  }
  
  private String c(String paramString)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      if (a.contains(paramString))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("fabric_");
        ((StringBuilder)localObject).append(paramString);
        return ((StringBuilder)localObject).toString();
      }
      Object localObject = paramString.replaceAll("[^\\p{Alnum}_]+", "_");
      if ((!((String)localObject).startsWith("ga_")) && (!((String)localObject).startsWith("google_")) && (!((String)localObject).startsWith("firebase_")))
      {
        paramString = (String)localObject;
        if (Character.isLetter(((String)localObject).charAt(0))) {}
      }
      else
      {
        paramString = new StringBuilder();
        paramString.append("fabric_");
        paramString.append((String)localObject);
        paramString = paramString.toString();
      }
      localObject = paramString;
      if (paramString.length() > 40) {
        localObject = paramString.substring(0, 40);
      }
      return (String)localObject;
    }
    return "fabric_unnamed_event";
  }
  
  public sk a(Fk paramFk)
  {
    boolean bool1 = Fk.b.g.equals(paramFk.c);
    boolean bool2 = true;
    int i;
    if ((bool1) && (paramFk.e != null)) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if ((Fk.b.h.equals(paramFk.c)) && (paramFk.g != null)) {
      j = 1;
    } else {
      j = 0;
    }
    if ((i == 0) && (j == 0)) {
      return null;
    }
    Object localObject1;
    Object localObject2;
    if (j != 0)
    {
      localObject1 = b(paramFk);
    }
    else
    {
      localObject2 = new Bundle();
      Map localMap = paramFk.f;
      localObject1 = localObject2;
      if (localMap != null)
      {
        a((Bundle)localObject2, localMap);
        localObject1 = localObject2;
      }
    }
    if (j != 0)
    {
      localObject2 = (String)paramFk.h.get("success");
      if ((localObject2 == null) || (Boolean.parseBoolean((String)localObject2))) {
        bool2 = false;
      }
      paramFk = a(paramFk.g, bool2);
    }
    else
    {
      paramFk = c(paramFk.e);
    }
    Naa.e().d("Answers", "Logging event into firebase...");
    return new sk(paramFk, (Bundle)localObject1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */