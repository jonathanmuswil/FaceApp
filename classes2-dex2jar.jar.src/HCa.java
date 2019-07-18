import android.graphics.Bitmap;

public final class hCa
  extends _Ba
{
  public hCa()
  {
    super("\n#ifdef GL_ES\nprecision mediump float;\n#endif\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D unsharpTexture;\nuniform lowp float intensity;\n\nvoid main()\n{\n    vec3 tex  = texture2D(inputImageTexture, textureCoordinate).rgb;\n    vec3 unsh = texture2D(unsharpTexture, textureCoordinate).rgb;\n    vec3 res  = tex * 2.0 - unsh;\n\n    gl_FragColor = vec4(mix(tex, res, intensity), 1.0);\n}\n", new String[] { "unsharpTexture" }, 0, 4, null);
  }
  
  public final void a(Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "value");
    a("unsharpTexture", paramBitmap);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */