import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class qc
{
  public static Typeface a(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, qc.a parama)
    throws Resources.NotFoundException
  {
    if (paramContext.isRestricted()) {
      return null;
    }
    return a(paramContext, paramInt1, paramTypedValue, paramInt2, parama, null, true);
  }
  
  private static Typeface a(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, qc.a parama, Handler paramHandler, boolean paramBoolean)
  {
    Resources localResources = paramContext.getResources();
    localResources.getValue(paramInt1, paramTypedValue, true);
    paramContext = a(paramContext, localResources, paramTypedValue, paramInt1, paramInt2, parama, paramHandler, paramBoolean);
    if ((paramContext == null) && (parama == null))
    {
      paramContext = new StringBuilder();
      paramContext.append("Font resource ID #0x");
      paramContext.append(Integer.toHexString(paramInt1));
      paramContext.append(" could not be retrieved.");
      throw new Resources.NotFoundException(paramContext.toString());
    }
    return paramContext;
  }
  
  private static Typeface a(Context paramContext, Resources paramResources, TypedValue paramTypedValue, int paramInt1, int paramInt2, qc.a parama, Handler paramHandler, boolean paramBoolean)
  {
    Object localObject = paramTypedValue.string;
    if (localObject != null)
    {
      paramTypedValue = ((CharSequence)localObject).toString();
      if (!paramTypedValue.startsWith("res/"))
      {
        if (parama != null) {
          parama.a(-3, paramHandler);
        }
        return null;
      }
      localObject = uc.a(paramResources, paramInt1, paramInt2);
      if (localObject != null)
      {
        if (parama != null) {
          parama.a((Typeface)localObject, paramHandler);
        }
        return (Typeface)localObject;
      }
      try
      {
        if (paramTypedValue.toLowerCase().endsWith(".xml"))
        {
          localObject = lc.a(paramResources.getXml(paramInt1), paramResources);
          if (localObject == null)
          {
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (parama != null) {
              parama.a(-3, paramHandler);
            }
            return null;
          }
          return uc.a(paramContext, (lc.a)localObject, paramResources, paramInt1, paramInt2, parama, paramHandler, paramBoolean);
        }
        paramContext = uc.a(paramContext, paramResources, paramInt1, paramTypedValue, paramInt2);
        if (parama != null) {
          if (paramContext != null) {
            parama.a(paramContext, paramHandler);
          } else {
            parama.a(-3, paramHandler);
          }
        }
        return paramContext;
      }
      catch (IOException paramContext)
      {
        paramResources = new StringBuilder();
        paramResources.append("Failed to read xml resource ");
        paramResources.append(paramTypedValue);
        Log.e("ResourcesCompat", paramResources.toString(), paramContext);
      }
      catch (XmlPullParserException paramResources)
      {
        paramContext = new StringBuilder();
        paramContext.append("Failed to parse xml resource ");
        paramContext.append(paramTypedValue);
        Log.e("ResourcesCompat", paramContext.toString(), paramResources);
      }
      if (parama != null) {
        parama.a(-3, paramHandler);
      }
      return null;
    }
    paramContext = new StringBuilder();
    paramContext.append("Resource \"");
    paramContext.append(paramResources.getResourceName(paramInt1));
    paramContext.append("\" (");
    paramContext.append(Integer.toHexString(paramInt1));
    paramContext.append(") is not a Font: ");
    paramContext.append(paramTypedValue);
    throw new Resources.NotFoundException(paramContext.toString());
  }
  
  public static Drawable a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    throws Resources.NotFoundException
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramResources.getDrawable(paramInt, paramTheme);
    }
    return paramResources.getDrawable(paramInt);
  }
  
  public static abstract class a
  {
    public abstract void a(int paramInt);
    
    public final void a(int paramInt, Handler paramHandler)
    {
      Handler localHandler = paramHandler;
      if (paramHandler == null) {
        localHandler = new Handler(Looper.getMainLooper());
      }
      localHandler.post(new pc(this, paramInt));
    }
    
    public abstract void a(Typeface paramTypeface);
    
    public final void a(Typeface paramTypeface, Handler paramHandler)
    {
      Handler localHandler = paramHandler;
      if (paramHandler == null) {
        localHandler = new Handler(Looper.getMainLooper());
      }
      localHandler.post(new oc(this, paramTypeface));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */