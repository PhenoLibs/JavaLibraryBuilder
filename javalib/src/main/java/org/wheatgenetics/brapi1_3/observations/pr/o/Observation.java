package org.wheatgenetics.brapi1_3.observations.pr.o;

/**
 * Uses:
 * io.swagger.client.model.PhenotypesRequestObservation
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Utils
 */
class Observation extends io.swagger.client.model.PhenotypesRequestObservation
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private transient org.wheatgenetics.brapi1_3.observations.pr.o.Observation.Container container;
    private           int                                                                position ;
    // endregion

    // region Constructors
    /**
     * Called by second Observation(),
     * org.wheatgenetics.brapi1_3.observations.pr.o.Observations.append(), and ObservationsTest.
     */
    Observation(final org.wheatgenetics.brapi1_3.observations.pr.o.Observation.Container container)
    { super(); this.setContainer(container); }

    /**
     * Called by third Observation() and
     * org.wheatgenetics.brapi1_3.observations.pr.o.Observations.append(observations).
     */
    Observation(
    final org.wheatgenetics.brapi1_3.observations.pr.o.Observation.Container container  ,
    final io.swagger.client.model.PhenotypesRequestObservation               observation)
    {
        this(container); if (null != observation) this
            .collector              (observation.getCollector              ())
            .observationDbId        (observation.getObservationDbId        ())
            .observationTimeStamp   (observation.getObservationTimeStamp   ())
            .observationVariableDbId(observation.getObservationVariableDbId())
            .observationVariableName(observation.getObservationVariableName())
            .season                 (observation.getSeason                 ())
            .value                  (observation.getValue                  ());
    }

    /**
     * Called by androidlibrary
     * org.wheatgenetics.brapi1_3.observations.pr.o.ObservationAlertDialog.show().
     */
    @java.lang.SuppressWarnings({"unused"})
    Observation(final org.wheatgenetics.brapi1_3.observations.pr.o.Observation observation)
    { this(observation.container, observation); }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setContainer(
    final org.wheatgenetics.brapi1_3.observations.pr.o.Observation.Container container)
    { this.container = container; }

    @java.lang.Override public int getPosition() { return this.position; }

    @java.lang.Override public void setPosition(final int position)
    { this.position = org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }

    @java.lang.Override public java.lang.String getTitle  () { return this.getObservationDbId(); }
    @java.lang.Override public java.lang.String getContent() { return this.toString          (); }

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
    final org.wheatgenetics.brapi1_3.observations.pr.o.Observation.Container container)
    { return container == this.container; }
}