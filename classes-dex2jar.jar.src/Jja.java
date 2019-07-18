import java.util.Currency;
import java.util.Map;

public final class jja
{
  private static final Map<String, String> a = DWa.b(new WVa[] { new WVa("EUR", "€"), new WVa("USD", "$"), new WVa("GBP", "£"), new WVa("CZK", "Kč"), new WVa("TRY", "₺"), new WVa("JPY", "¥"), new WVa("AED", "د.إ"), new WVa("AFN", "؋"), new WVa("ARS", "$"), new WVa("AUD", "$"), new WVa("BBD", "$"), new WVa("BDT", " Tk"), new WVa("BGN", "лв"), new WVa("BHD", "BD"), new WVa("BMD", "$"), new WVa("BND", "$"), new WVa("BOB", "$b"), new WVa("BRL", "R$"), new WVa("BTN", "Nu."), new WVa("BZD", "BZ$"), new WVa("CAD", "$"), new WVa("CLP", "$"), new WVa("CNY", "¥"), new WVa("COP", "$"), new WVa("CRC", "₡"), new WVa("DKK", "kr"), new WVa("DOP", "RD$"), new WVa("EGP", "£"), new WVa("ETB", "Br"), new WVa("GEL", "₾"), new WVa("GHS", "¢"), new WVa("GMD", "D"), new WVa("GYD", "$"), new WVa("HKD", "$"), new WVa("HRK", "kn"), new WVa("HUF", "Ft"), new WVa("IDR", "Rp"), new WVa("ILS", "₪"), new WVa("INR", "0"), new WVa("ISK", "kr"), new WVa("JMD", "J$"), new WVa("JPY", "¥"), new WVa("KES", "KSh"), new WVa("KRW", "₩"), new WVa("KYD", "$"), new WVa("KZT", "лв"), new WVa("LAK", "₭"), new WVa("LKR", "₨"), new WVa("LRD", "$"), new WVa("LTL", "Lt"), new WVa("MKD", "ден"), new WVa("MNT", "₮"), new WVa("MUR", "₨"), new WVa("MWK", "MK"), new WVa("MXN", "$"), new WVa("MYR", "RM"), new WVa("MZN", "MT"), new WVa("NAD", "$"), new WVa("NGN", "₦"), new WVa("NIO", "C$"), new WVa("NOK", "kr"), new WVa("NPR", "₨"), new WVa("NZD", "$"), new WVa("OMR", "﷼"), new WVa("PEN", "S/."), new WVa("PGK", "K"), new WVa("PHP", "₱"), new WVa("PKR", "₨"), new WVa("PLN", "zł"), new WVa("PYG", "Gs"), new WVa("QAR", "﷼"), new WVa("RON", "lei"), new WVa("RSD", "Дин."), new WVa("RUB", "₽"), new WVa("SAR", "﷼"), new WVa("SEK", "kr"), new WVa("SGD", "$"), new WVa("SOS", "S"), new WVa("SRD", "$"), new WVa("THB", "฿"), new WVa("TTD", "TT$"), new WVa("TWD", "NT$"), new WVa("TZS", "TSh"), new WVa("UAH", "₴"), new WVa("UGX", "USh"), new WVa("UYU", "$U"), new WVa("VEF", "Bs"), new WVa("VND", "₫"), new WVa("YER", "﷼"), new WVa("ZAR", "R") });
  public static final jja b = new jja();
  
  public final String a(Currency paramCurrency)
  {
    oXa.b(paramCurrency, "currency");
    String str = paramCurrency.getSymbol();
    paramCurrency = paramCurrency.getCurrencyCode();
    oXa.a(paramCurrency, "currency.currencyCode");
    if (paramCurrency != null)
    {
      paramCurrency = paramCurrency.toUpperCase();
      oXa.a(paramCurrency, "(this as java.lang.String).toUpperCase()");
      if ((oXa.a(str, paramCurrency) ^ true))
      {
        oXa.a(str, "defaultSymbol");
        return str;
      }
      paramCurrency = (String)a.get(paramCurrency);
      if (paramCurrency == null) {
        paramCurrency = str;
      }
      return paramCurrency;
    }
    throw new _Va("null cannot be cast to non-null type java.lang.String");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */