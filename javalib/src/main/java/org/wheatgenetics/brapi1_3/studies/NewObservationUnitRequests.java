package org.wheatgenetics.brapi1_3.studies;

/**
 * Used:
 * io.swagger.client.model.ObservationUnit
 * io.swagger.client.model.ObservationUnitsResponse1
 * io.swagger.client.model.ObservationUnitsResponse1Result
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.brapi1_3.studies.NewObservationUnitRequest
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject", "unused"})
public class NewObservationUnitRequests extends java.lang.Object
implements org.wheatgenetics.javalib.mstrdtl.Items
{
    private java.util.ArrayList<org.wheatgenetics.brapi1_3.studies.NewObservationUnitRequest>
        arrayListInstance = null;

    private java.util.ArrayList<org.wheatgenetics.brapi1_3.studies.NewObservationUnitRequest>
    arrayList()
    {
        if (null == this.arrayListInstance)
            // noinspection Convert2Diamond
            this.arrayListInstance = new java.util.ArrayList<
                org.wheatgenetics.brapi1_3.studies.NewObservationUnitRequest>();
        return this.arrayListInstance;
    }

    public NewObservationUnitRequests(
    final io.swagger.client.model.ObservationUnitsResponse1 observationUnitsResponse1)
    {
        super();

        if (null != observationUnitsResponse1)
        {
            final io.swagger.client.model.ObservationUnitsResponse1Result result =
                observationUnitsResponse1.getResult();
            if (null != result)
            {
                final java.util.List<io.swagger.client.model.ObservationUnit> data =
                    result.getData();
                if (null != data) if (data.size() > 0)
                {
                    int position = 0;
                    for (final io.swagger.client.model.ObservationUnit observationUnit: data)
                        this.arrayList().add(
                            new org.wheatgenetics.brapi1_3.studies.NewObservationUnitRequest(
                                position++, observationUnit));
                }
            }
        }
    }

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void add(final org.wheatgenetics.javalib.mstrdtl.Item item)
    { this.arrayList().add((org.wheatgenetics.brapi1_3.studies.NewObservationUnitRequest) item); }

    @java.lang.Override public void append()
    { this.add(new org.wheatgenetics.brapi1_3.studies.NewObservationUnitRequest(this.size())); }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    { return null == this.arrayListInstance ? null : this.arrayListInstance.get(position); }
    // endregion
}