package org.wheatgenetics.brapi1_3.studies.slr;                           // slr: StudyLayoutRequest

/**
 * Uses:
 * io.swagger.client.model.ObservationUnitPosition
 * io.swagger.client.model.ObservationUnitPosition.EntryTypeEnum
 * io.swagger.client.model.ObservationUnitPosition.PositionCoordinateXTypeEnum
 * io.swagger.client.model.ObservationUnitPosition.PositionCoordinateYTypeEnum
 * io.swagger.client.model.StudyLayoutRequestLayout
 * io.swagger.client.model.StudyLayoutRequestLayout.EntryTypeEnum
 * io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateXTypeEnum
 * io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateYTypeEnum
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Utils
 */
class StudyLayoutRequestLayout extends io.swagger.client.model.StudyLayoutRequestLayout
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private transient org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout.Container
        container;
    private int position;
    // endregion

    // region Constructors
    /**
     * Called by second StudyLayoutRequestLayout(), third StudyLayoutRequestLayout(),
     * org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest.append(), and
     * StudyLayoutRequestTest.
     */
    StudyLayoutRequestLayout(final
    org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout.Container container)
    { super(); this.setContainer(container); }

    /** Called by org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest(). */
    StudyLayoutRequestLayout(
    final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout.Container container,
    final io.swagger.client.model.ObservationUnitPosition             observationUnitPosition)
    {
        this(container);
        if (null != observationUnitPosition)
        {
            // region setBlockNumber()
            {
                final java.lang.String blockNumber = observationUnitPosition.getBlockNumber();
                this.setBlockNumber(null == blockNumber ?
                    null : java.lang.Integer.valueOf(blockNumber));
            }
            // endregion

            // region setEntryType()
            {
                final io.swagger.client.model.StudyLayoutRequestLayout.EntryTypeEnum
                    destinationEntryTypeEnum;
                {
                    final io.swagger.client.model.ObservationUnitPosition.EntryTypeEnum
                        sourceEntryTypeEnum = observationUnitPosition.getEntryType();
                    if (null == sourceEntryTypeEnum)
                        destinationEntryTypeEnum = null;
                    else
                        switch (sourceEntryTypeEnum)
                        {
                            case CHECK:
                                destinationEntryTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.EntryTypeEnum.CHECK;
                                break;

                            case TEST:
                                destinationEntryTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.EntryTypeEnum.TEST;
                                break;

                            case FILLER:
                                destinationEntryTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.EntryTypeEnum.FILLER;
                                break;

                            default: destinationEntryTypeEnum = null; break;
                        }
                }
                this.setEntryType(destinationEntryTypeEnum);
            }
            // endregion

            this.setObservationUnitDbId(observationUnitPosition.getObservationUnitDbId());
            this.setPositionCoordinateX(observationUnitPosition.getPositionCoordinateX());

            // region setPositionCoordinateXType()
            {
                final io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateXTypeEnum
                    destinationPositionCoordinateXTypeEnum;
                {
                    final
                        io.swagger.client.model.ObservationUnitPosition.PositionCoordinateXTypeEnum
                            sourcePositionCoordinateXTypeEnum =
                                observationUnitPosition.getPositionCoordinateXType();
                    if (null == sourcePositionCoordinateXTypeEnum)
                        destinationPositionCoordinateXTypeEnum = null;
                    else
                        switch (sourcePositionCoordinateXTypeEnum)
                        {
                            case LONGITUDE:
                                destinationPositionCoordinateXTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.LONGITUDE;
                                break;

                            case LATITUDE:
                                destinationPositionCoordinateXTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.LATITUDE;
                                break;

                            case PLANTED_ROW:
                                destinationPositionCoordinateXTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateXTypeEnum.PLANTED_ROW;
                                break;

                            case PLANTED_INDIVIDUAL:
                                destinationPositionCoordinateXTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateXTypeEnum.PLANTED_INDIVIDUAL;
                                break;

                            case GRID_ROW:
                                destinationPositionCoordinateXTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.GRID_ROW;
                                break;

                            case GRID_COL:
                                destinationPositionCoordinateXTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.GRID_COL;
                                break;

                            case MEASURED_ROW:
                                destinationPositionCoordinateXTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateXTypeEnum.MEASURED_ROW;
                                break;

                            case MEASURED_COL:
                                destinationPositionCoordinateXTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateXTypeEnum.MEASURED_COL;
                                break;

                            default: destinationPositionCoordinateXTypeEnum = null;
                        }
                }
                this.setPositionCoordinateXType(destinationPositionCoordinateXTypeEnum);
            }
            // endregion

            this.setPositionCoordinateY(observationUnitPosition.getPositionCoordinateY());

            // region setPositionCoordinateYType()
            {
                final io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateYTypeEnum
                    destinationPositionCoordinateYTypeEnum;
                {
                    final
                        io.swagger.client.model.ObservationUnitPosition.PositionCoordinateYTypeEnum
                            sourcePositionCoordinateYTypeEnum =
                                observationUnitPosition.getPositionCoordinateYType();
                    if (null == sourcePositionCoordinateYTypeEnum)
                        destinationPositionCoordinateYTypeEnum = null;
                    else
                        switch (sourcePositionCoordinateYTypeEnum)
                        {
                            case LONGITUDE:
                                destinationPositionCoordinateYTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.LONGITUDE;
                                break;

                            case LATITUDE:
                                destinationPositionCoordinateYTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.LATITUDE;
                                break;

                            case PLANTED_ROW:
                                destinationPositionCoordinateYTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateYTypeEnum.PLANTED_ROW;
                                break;

                            case PLANTED_INDIVIDUAL:
                                destinationPositionCoordinateYTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateYTypeEnum.PLANTED_INDIVIDUAL;
                                break;

                            case GRID_ROW:
                                destinationPositionCoordinateYTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.GRID_ROW;
                                break;

                            case GRID_COL:
                                destinationPositionCoordinateYTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.GRID_COL;
                                break;

                            case MEASURED_ROW:
                                destinationPositionCoordinateYTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateYTypeEnum.MEASURED_ROW;
                                break;

                            case MEASURED_COL:
                                destinationPositionCoordinateYTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateYTypeEnum.MEASURED_COL;
                                break;

                            default: destinationPositionCoordinateYTypeEnum = null;
                        }
                }
                this.setPositionCoordinateYType(destinationPositionCoordinateYTypeEnum);
            }
            // endregion

            // region setReplicate()
            final java.lang.String replicate = observationUnitPosition.getReplicate();
            this.setReplicate(null == replicate ? null : java.lang.Integer.valueOf(replicate));
            // endregion
        }
    }

    /** Called by org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest.fromJson(). */
    StudyLayoutRequestLayout(
    final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout.Container container,
    final io.swagger.client.model.StudyLayoutRequestLayout           studyLayoutRequestLayout)
    {
        this(container);
        if (null != studyLayoutRequestLayout) this
            .blockNumber            (studyLayoutRequestLayout.getBlockNumber            ())
            .entryType              (studyLayoutRequestLayout.getEntryType              ())
            .observationUnitDbId    (studyLayoutRequestLayout.getObservationUnitDbId    ())
            .positionCoordinateX    (studyLayoutRequestLayout.getPositionCoordinateX    ())
            .positionCoordinateXType(studyLayoutRequestLayout.getPositionCoordinateXType())
            .positionCoordinateY    (studyLayoutRequestLayout.getPositionCoordinateY    ())
            .positionCoordinateYType(studyLayoutRequestLayout.getPositionCoordinateYType())
            .replicate              (studyLayoutRequestLayout.getReplicate              ());
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setContainer(
    final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout.Container container)
    { this.container = container; }

    @java.lang.Override public int getPosition() { return this.position; }

    @java.lang.Override public void setPosition(final int position)
    { this.position = org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }

    @java.lang.Override public java.lang.String getTitle() { return this.getObservationUnitDbId(); }

    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

    @java.lang.Override public boolean canMoveUp()
    {
        return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(
            this.container, this.getPosition());
    }

    @java.lang.Override public boolean canMoveDown()
    {
        return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(
            this.container, this.getPosition());
    }
    // endregion

    boolean containersAreTheSame(
    final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout.Container container)
    { return container == this.container; }
}