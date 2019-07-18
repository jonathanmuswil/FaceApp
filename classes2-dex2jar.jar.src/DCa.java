import android.graphics.Bitmap;
import android.graphics.PointF;

public final class dCa
  extends _Ba
{
  public dCa()
  {
    super("\n#ifdef GL_ES\nprecision mediump float;\n#endif\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D noiseNearestTileableTexture;\nuniform vec2 noiseStretch;\nuniform lowp float intensity;\n\nvoid main()\n{\n    vec3  tex = texture2D(inputImageTexture, textureCoordinate).rgb;\n    float nos1 = texture2D(noiseNearestTileableTexture, textureCoordinate * noiseStretch).r;\n    float nos2 = texture2D(noiseNearestTileableTexture, textureCoordinate * noiseStretch * 2.35).r;\n\n    vec3  res = tex + vec3(0.35) * (nos1 + nos2 - 1.0);\n    gl_FragColor = vec4(mix(tex, res, intensity), 1.0);\n}\n", new String[] { "noiseNearestTileableTexture", "noiseStretch" }, 33990);
  }
  
  public final void a(Bitmap paramBitmap, PointF paramPointF)
  {
    oXa.b(paramBitmap, "value");
    oXa.b(paramPointF, "stretch");
    a("noiseNearestTileableTexture", paramBitmap);
    a("noiseStretch", paramPointF);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */