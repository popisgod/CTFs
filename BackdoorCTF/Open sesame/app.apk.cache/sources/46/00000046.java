package androidx.activity;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnBackPressedDispatcher.kt */
@Metadata(m24k = 3, m23mv = {1, 8, 0}, m21xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public /* synthetic */ class OnBackPressedDispatcher$addCancellableCallback$1 extends FunctionReferenceImpl implements Functions<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public OnBackPressedDispatcher$addCancellableCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}