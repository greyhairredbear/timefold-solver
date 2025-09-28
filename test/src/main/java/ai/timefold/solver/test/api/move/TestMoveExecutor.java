package ai.timefold.solver.test.api.move;

// TODO: correct import?
import ai.timefold.solver.core.impl.heuristic.move.Move;

public interface TestMoveExecutor<Solution_> {
    TestMoveExecutor<Solution_> create()

    void execute(Move<Solution_> move);
}

/*

// get score director
// set working solution to user-provided solution
// execute move director

 */
