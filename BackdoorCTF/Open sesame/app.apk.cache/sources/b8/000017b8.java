package kotlinx.coroutines.flow;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Merge.kt */
@Metadata(m24k = 3, m23mv = {1, 6, 0}, m21xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m14c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", m13f = "Merge.kt", m12i = {}, m11l = {80}, m10m = "emit", m9n = {}, m8s = {})
/* loaded from: classes.dex */
public final class FlowKt__MergeKt$flattenConcat$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__MergeKt$flattenConcat$1$1<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$flattenConcat$1$1$emit$1(FlowKt__MergeKt$flattenConcat$1$1<? super T> flowKt__MergeKt$flattenConcat$1$1, Continuation<? super FlowKt__MergeKt$flattenConcat$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = flowKt__MergeKt$flattenConcat$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Flow) null, (Continuation<? super Unit>) this);
    }
}