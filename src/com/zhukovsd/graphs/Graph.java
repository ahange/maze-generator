package com.zhukovsd.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Basic graph implementation.
 * @param <E> type of {@link Vertex vertex} in graph
 */
public class Graph<E extends Vertex> {
    /**
     * A list of connected {@link Vertex vertexes}
     */
    public final List<E> vertexList = new ArrayList<E>();

    /**
     * Method connects 2 {@link Vertex vertexes} by creating directional {@link Edge edge}.
     * Method assumes that given vertexes belongs to current graph.
     * @param left left vertex, source for new directional edge connecting given vertexes
     * @param right right vertex, destination for new directional edge connecting given vertexes
     * @return new edge, connecting given vertexes
     */
    public Edge connect(Vertex left, Vertex right) {
        Edge edge = new Edge(left, right);
        left.edgeList.add(edge);

        return edge;
    }

    /**
     * Method connects 2 {@link Vertex vertexes} by creating 2 directional {@link Edge edges}.
     * Method assumes that given vertexes belongs to current graph.
     * @param left first vertex to connect
     * @param right second vertex to connect
     */
    public void connectToEachOther(Vertex left, Vertex right) {
        connect(left, right);
        connect(right, left);
    }
}