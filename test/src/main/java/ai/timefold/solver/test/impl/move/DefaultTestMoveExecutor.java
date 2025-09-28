package ai.timefold.solver.test.impl.move;

import ai.timefold.solver.core.api.score.Score;
import ai.timefold.solver.core.impl.domain.solution.descriptor.SolutionDescriptor;
import ai.timefold.solver.core.impl.heuristic.move.Move;
import ai.timefold.solver.core.impl.score.director.InnerScoreDirector;
import ai.timefold.solver.test.api.move.TestMoveExecutor;

public class DefaultTestMoveExecutor<Solution_, Score_ extends Score<Score_>> implements TestMoveExecutor<Solution_> {
    private final InnerScoreDirector<Solution_, Score_> innerScoreDirector;
    private final SolutionDescriptor<Solution_> solutionDescriptor;

    public DefaultTestMoveExecutor(SolutionDescriptor<Solution_> solutionDescriptor) {
        this.solutionDescriptor = solutionDescriptor;
        this.innerScoreDirector = null;
    }

    @Override
    public void execute(Move<Solution_> move) {
        innerScoreDirector.getMoveDirector().execute(move);
    }
}
