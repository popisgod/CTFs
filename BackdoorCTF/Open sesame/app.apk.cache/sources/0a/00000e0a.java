package com.google.android.material.color.utilities;

import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final Function<DynamicScheme, Double> chroma;
    private final HashMap<DynamicScheme, Hct> hctCache = new HashMap<>();
    public final Function<DynamicScheme, Double> hue;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaConstraint> toneDeltaConstraint;
    public final Function<DynamicScheme, Double> toneMaxContrast;
    public final Function<DynamicScheme, Double> toneMinContrast;

    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    public static /* synthetic */ DynamicColor lambda$getTone$11(DynamicColor dynamicColor, DynamicScheme dynamicScheme) {
        return dynamicColor;
    }

    public static /* synthetic */ Double lambda$toneMinContrastDefault$16(Double d) {
        return d;
    }

    public DynamicColor(Function<DynamicScheme, Double> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, Double> function3, Function<DynamicScheme, Double> function4, Function<DynamicScheme, DynamicColor> function5, Function<DynamicScheme, Double> function6, Function<DynamicScheme, Double> function7, Function<DynamicScheme, ToneDeltaConstraint> function8) {
        this.hue = function;
        this.chroma = function2;
        this.tone = function3;
        this.opacity = function4;
        this.background = function5;
        this.toneMinContrast = function6;
        this.toneMaxContrast = function7;
        this.toneDeltaConstraint = function8;
    }

    public static DynamicColor fromArgb(int i) {
        final Hct fromInt = Hct.fromInt(i);
        final TonalPalette fromInt2 = TonalPalette.fromInt(i);
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$0(TonalPalette.this, (DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                valueOf = Double.valueOf(Hct.this.getTone());
                return valueOf;
            }
        });
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda17
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$2(i, (DynamicScheme) obj);
            }
        }, function);
    }

    public static /* synthetic */ TonalPalette lambda$fromArgb$2(int i, DynamicScheme dynamicScheme) {
        return TonalPalette.fromInt(i);
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda16
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$3(i, (DynamicScheme) obj);
            }
        }, function, function2);
    }

    public static /* synthetic */ TonalPalette lambda$fromArgb$3(int i, DynamicScheme dynamicScheme) {
        return TonalPalette.fromInt(i);
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$4(i, (DynamicScheme) obj);
            }
        }, function, function2, function3);
    }

    public static /* synthetic */ TonalPalette lambda$fromArgb$4(int i, DynamicScheme dynamicScheme) {
        return TonalPalette.fromInt(i);
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2) {
        return fromPalette(function, function2, null, null);
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, DynamicColor> function3) {
        return fromPalette(function, function2, function3, null);
    }

    public static DynamicColor fromPalette(final Function<DynamicScheme, TonalPalette> function, final Function<DynamicScheme, Double> function2, final Function<DynamicScheme, DynamicColor> function3, final Function<DynamicScheme, ToneDeltaConstraint> function4) {
        return new DynamicColor(new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromPalette$5(function, (DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda10
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromPalette$6(function, (DynamicScheme) obj);
            }
        }, function2, null, function3, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda11
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromPalette$7(function2, function3, function4, (DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda12
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromPalette$8(function2, function3, function4, (DynamicScheme) obj);
            }
        }, function4);
    }

    public static /* synthetic */ Double lambda$fromPalette$5(Function function, DynamicScheme dynamicScheme) {
        return Double.valueOf(((TonalPalette) function.apply(dynamicScheme)).getHue());
    }

    public static /* synthetic */ Double lambda$fromPalette$6(Function function, DynamicScheme dynamicScheme) {
        return Double.valueOf(((TonalPalette) function.apply(dynamicScheme)).getChroma());
    }

    public static /* synthetic */ Double lambda$fromPalette$7(Function function, Function function2, Function function3, DynamicScheme dynamicScheme) {
        return Double.valueOf(toneMinContrastDefault(function, function2, dynamicScheme, function3));
    }

    public static /* synthetic */ Double lambda$fromPalette$8(Function function, Function function2, Function function3, DynamicScheme dynamicScheme) {
        return Double.valueOf(toneMaxContrastDefault(function, function2, dynamicScheme, function3));
    }

    public int getArgb(DynamicScheme dynamicScheme) {
        int i = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK);
    }

    public Hct getHct(DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct from = Hct.from(this.hue.apply(dynamicScheme).doubleValue(), this.chroma.apply(dynamicScheme).doubleValue(), getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, from);
        return from;
    }

    public double getTone(final DynamicScheme dynamicScheme) {
        final double d;
        final double doubleValue = this.tone.apply(dynamicScheme).doubleValue();
        boolean z = true;
        boolean z2 = dynamicScheme.contrastLevel < 0.0d;
        if (dynamicScheme.contrastLevel != 0.0d) {
            double doubleValue2 = this.tone.apply(dynamicScheme).doubleValue();
            doubleValue = doubleValue2 + (((z2 ? this.toneMinContrast : this.toneMaxContrast).apply(dynamicScheme).doubleValue() - doubleValue2) * Math.abs(dynamicScheme.contrastLevel));
        }
        Function<DynamicScheme, DynamicColor> function = this.background;
        DynamicColor apply = function == null ? null : function.apply(dynamicScheme);
        if (apply != null) {
            Function<DynamicScheme, DynamicColor> function2 = apply.background;
            if (function2 == null || function2.apply(dynamicScheme) == null) {
                z = false;
            }
            double ratioOfTones = Contrast.ratioOfTones(this.tone.apply(dynamicScheme).doubleValue(), apply.tone.apply(dynamicScheme).doubleValue());
            if (z2) {
                r11 = z ? Contrast.ratioOfTones(this.toneMinContrast.apply(dynamicScheme).doubleValue(), apply.toneMinContrast.apply(dynamicScheme).doubleValue()) : 1.0d;
                d = ratioOfTones;
            } else {
                double ratioOfTones2 = Contrast.ratioOfTones(this.toneMaxContrast.apply(dynamicScheme).doubleValue(), apply.toneMaxContrast.apply(dynamicScheme).doubleValue());
                r11 = z ? Math.min(ratioOfTones2, ratioOfTones) : 1.0d;
                if (z) {
                    d = Math.max(ratioOfTones2, ratioOfTones);
                }
            }
            return calculateDynamicTone(dynamicScheme, this.tone, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda18
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DynamicColor.lambda$getTone$9(DynamicScheme.this, (DynamicColor) obj);
                }
            }, new BiFunction() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return DynamicColor.lambda$getTone$10(doubleValue, (Double) obj, (Double) obj2);
                }
            }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DynamicColor.lambda$getTone$11(DynamicColor.this, (DynamicScheme) obj);
                }
            }, this.toneDeltaConstraint, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DynamicColor.lambda$getTone$12(r1, (Double) obj);
                }
            }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DynamicColor.lambda$getTone$13(d, (Double) obj);
                }
            });
        }
        d = 21.0d;
        return calculateDynamicTone(dynamicScheme, this.tone, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda18
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$getTone$9(DynamicScheme.this, (DynamicColor) obj);
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return DynamicColor.lambda$getTone$10(doubleValue, (Double) obj, (Double) obj2);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$getTone$11(DynamicColor.this, (DynamicScheme) obj);
            }
        }, this.toneDeltaConstraint, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$getTone$12(r1, (Double) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$getTone$13(d, (Double) obj);
            }
        });
    }

    public static /* synthetic */ Double lambda$getTone$9(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return Double.valueOf(dynamicColor.getTone(dynamicScheme));
    }

    public static /* synthetic */ Double lambda$getTone$10(double d, Double d2, Double d3) {
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$getTone$12(double d, Double d2) {
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$getTone$13(double d, Double d2) {
        return Double.valueOf(d);
    }

    public static double toneMinContrastDefault(final Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda13
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$toneMinContrastDefault$14(DynamicScheme.this, (DynamicColor) obj);
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda14
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return DynamicColor.lambda$toneMinContrastDefault$15(function, dynamicScheme, function2, (Double) obj, (Double) obj2);
            }
        }, function2, function3, null, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda15
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$toneMinContrastDefault$16((Double) obj);
            }
        });
    }

    public static /* synthetic */ Double lambda$toneMinContrastDefault$14(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return dynamicColor.toneMinContrast.apply(dynamicScheme);
    }

    public static /* synthetic */ Double lambda$toneMinContrastDefault$15(Function function, DynamicScheme dynamicScheme, Function function2, Double d, Double d2) {
        double doubleValue = ((Double) function.apply(dynamicScheme)).doubleValue();
        if (d.doubleValue() >= 7.0d) {
            doubleValue = contrastingTone(d2.doubleValue(), 4.5d);
        } else if (d.doubleValue() >= 3.0d) {
            doubleValue = contrastingTone(d2.doubleValue(), 3.0d);
        } else if (function2 != null && function2.apply(dynamicScheme) != null && ((DynamicColor) function2.apply(dynamicScheme)).background != null && ((DynamicColor) function2.apply(dynamicScheme)).background.apply(dynamicScheme) != null) {
            doubleValue = contrastingTone(d2.doubleValue(), d.doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static double toneMaxContrastDefault(Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$toneMaxContrastDefault$17(DynamicScheme.this, (DynamicColor) obj);
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda9
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return DynamicColor.lambda$toneMaxContrastDefault$18(function2, dynamicScheme, (Double) obj, (Double) obj2);
            }
        }, function2, function3, null, null);
    }

    public static /* synthetic */ Double lambda$toneMaxContrastDefault$17(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return dynamicColor.toneMaxContrast.apply(dynamicScheme);
    }

    public static /* synthetic */ Double lambda$toneMaxContrastDefault$18(Function function, DynamicScheme dynamicScheme, Double d, Double d2) {
        if (function != null && function.apply(dynamicScheme) != null && ((DynamicColor) function.apply(dynamicScheme)).background != null && ((DynamicColor) function.apply(dynamicScheme)).background.apply(dynamicScheme) != null) {
            return Double.valueOf(contrastingTone(d2.doubleValue(), 7.0d));
        }
        return Double.valueOf(contrastingTone(d2.doubleValue(), Math.max(7.0d, d.doubleValue())));
    }

    public static double calculateDynamicTone(DynamicScheme dynamicScheme, Function<DynamicScheme, Double> function, Function<DynamicColor, Double> function2, BiFunction<Double, Double, Double> biFunction, Function<DynamicScheme, DynamicColor> function3, Function<DynamicScheme, ToneDeltaConstraint> function4, Function<Double, Double> function5, Function<Double, Double> function6) {
        double doubleValue = function.apply(dynamicScheme).doubleValue();
        DynamicColor apply = function3 == null ? null : function3.apply(dynamicScheme);
        if (apply == null) {
            return doubleValue;
        }
        double ratioOfTones = Contrast.ratioOfTones(doubleValue, apply.tone.apply(dynamicScheme).doubleValue());
        double doubleValue2 = function2.apply(apply).doubleValue();
        double doubleValue3 = biFunction.apply(Double.valueOf(ratioOfTones), Double.valueOf(doubleValue2)).doubleValue();
        double ratioOfTones2 = Contrast.ratioOfTones(doubleValue2, doubleValue3);
        double d = 1.0d;
        if (function5 != null && function5.apply(Double.valueOf(ratioOfTones)) != null) {
            d = function5.apply(Double.valueOf(ratioOfTones)).doubleValue();
        }
        double clampDouble = MathUtils.clampDouble(d, (function6 == null || function6.apply(Double.valueOf(ratioOfTones)) == null) ? 21.0d : function6.apply(Double.valueOf(ratioOfTones)).doubleValue(), ratioOfTones2);
        if (clampDouble != ratioOfTones2) {
            doubleValue3 = contrastingTone(doubleValue2, clampDouble);
        }
        Function<DynamicScheme, DynamicColor> function7 = apply.background;
        return ensureToneDelta((function7 == null || function7.apply(dynamicScheme) == null) ? enableLightForeground(doubleValue3) : doubleValue3, doubleValue, dynamicScheme, function4, function2);
    }

    static double ensureToneDelta(double d, double d2, DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function, Function<DynamicColor, Double> function2) {
        ToneDeltaConstraint apply = function == null ? null : function.apply(dynamicScheme);
        if (apply == null) {
            return d;
        }
        double d3 = apply.delta;
        double doubleValue = function2.apply(apply.keepAway).doubleValue();
        double abs = Math.abs(d - doubleValue);
        if (abs >= d3) {
            return d;
        }
        int i = C06491.f185x2c744fd[apply.keepAwayPolarity.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return d;
                }
                boolean z = d2 > apply.keepAway.tone.apply(dynamicScheme).doubleValue();
                double abs2 = Math.abs(abs - d3);
                return (!z ? d < abs2 : d + abs2 <= 100.0d) ? d - abs2 : d + abs2;
            }
            return MathUtils.clampDouble(0.0d, 100.0d, doubleValue - d3);
        }
        return MathUtils.clampDouble(0.0d, 100.0d, doubleValue + d3);
    }

    /* renamed from: com.google.android.material.color.utilities.DynamicColor$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C06491 {

        /* renamed from: $SwitchMap$com$google$android$material$color$utilities$TonePolarity */
        static final /* synthetic */ int[] f185x2c744fd;

        static {
            int[] iArr = new int[TonePolarity.values().length];
            f185x2c744fd = iArr;
            try {
                iArr[TonePolarity.DARKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f185x2c744fd[TonePolarity.LIGHTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f185x2c744fd[TonePolarity.NO_PREFERENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static double contrastingTone(double d, double d2) {
        double lighterUnsafe = Contrast.lighterUnsafe(d, d2);
        double darkerUnsafe = Contrast.darkerUnsafe(d, d2);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d);
        if (tonePrefersLightForeground(d)) {
            return (ratioOfTones >= d2 || ratioOfTones >= ratioOfTones2 || ((Math.abs(ratioOfTones - ratioOfTones2) > 0.1d ? 1 : (Math.abs(ratioOfTones - ratioOfTones2) == 0.1d ? 0 : -1)) < 0 && (ratioOfTones > d2 ? 1 : (ratioOfTones == d2 ? 0 : -1)) < 0 && (ratioOfTones2 > d2 ? 1 : (ratioOfTones2 == d2 ? 0 : -1)) < 0)) ? lighterUnsafe : darkerUnsafe;
        }
        return (ratioOfTones2 >= d2 || ratioOfTones2 >= ratioOfTones) ? darkerUnsafe : lighterUnsafe;
    }

    public static double enableLightForeground(double d) {
        if (!tonePrefersLightForeground(d) || toneAllowsLightForeground(d)) {
            return d;
        }
        return 49.0d;
    }

    public static boolean tonePrefersLightForeground(double d) {
        return Math.round(d) < 60;
    }

    public static boolean toneAllowsLightForeground(double d) {
        return Math.round(d) <= 49;
    }
}