package org.wheatgenetics.brapi1_3.observations.pr;

/**
 * Uses:
 * io.swagger.client.model.PhenotypesRequest
 * io.swagger.client.model.PhenotypesRequestData
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
 * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container
 */
@java.lang.SuppressWarnings({"unused"})
public class PhenotypesRequest extends io.swagger.client.model.PhenotypesRequest
implements org.wheatgenetics.javalib.mstrdtl.Items,
org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container
{
    // region Overridden Methods
    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (item instanceof org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData)
        {
            final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
                phenotypesRequestData =
                    (org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData) item;
            if (phenotypesRequestData.containersAreTheSame(this))
            {
                phenotypesRequestData.setPosition(this.size());
                this.addDataItem(phenotypesRequestData);
            }
        }
    }

    @java.lang.Override public void append()
    {
        this.append(
            new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData(this));
    }

    @java.lang.Override public int size()
    {
        final java.util.List<io.swagger.client.model.PhenotypesRequestData> data = this.getData();
        return null == data ? 0 : data.size();
    }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        final java.util.List<io.swagger.client.model.PhenotypesRequestData> data =
            this.getData();
        return null == data ? null :
            (org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData)
                data.get(nonNegativePosition);
    }
    // endregion

    // region org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container Overridden Method
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }
    // endregion
    // endregion
}